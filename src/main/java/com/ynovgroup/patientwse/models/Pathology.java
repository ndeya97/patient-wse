package com.ynovgroup.patientwse.models;

public class Pathology {

			private int id;
			private String name;
			private String severity;

			public Pathology(int id, String name, String severity) {
				this.id = id;
				this.name = name;
				this.severity = severity;
			}

			public int getPathologyId() {
				return id;
			}

			public String getPathologyName() {
				return name;
			}

			public String getPathologySeverity() {
				return severity;
			}

			@Override
			public String toString() {
				return "Pathology [id=" + id + ", name=" + name + ", sevrity=" + severity + "]";
			}

}
