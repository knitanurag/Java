package com.anurag.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable {

	private int id;

	private String name;

	private String gender;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(id);
		out.writeObject(name + "abc");
		out.writeObject(gender);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		if (!name.endsWith("abc"))
			throw new IOException("Corrupt Data");
		else
			name = (String) in.readObject();
		gender = (String) in.readObject();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
