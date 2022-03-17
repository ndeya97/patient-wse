package com.ynovgroup.patientwse.models;

public class Patient {

		private int id;
		private String name;
		private int age;

		public Patient(int id, String name, int age) {
			this.id = id;
			this.name = name;
			this.age = age;
		}

		public int getPatientId() {
			return id;
		}

		public String getPatientName() {
			return name;
		}

		public int getPatientAge() {
			return age;
		}

		@Override
		public String toString() {
			return "Patient [id=" + id + ", name=" + name + ", age=" + age + "]";
		}

	}


