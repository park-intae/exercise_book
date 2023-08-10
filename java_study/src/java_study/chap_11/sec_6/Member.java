package java_study.chap_11.sec_6;

public class Member implements Comparable<Member>{

		String name;
		
		public Member(String name) {
			super();
			this.name = name;
		}

		@Override
		public int compareTo(Member o) {
			// TODO Auto-generated method stub
			return name.compareTo(o.name);
		}

		@Override
		public String toString() {
			return "Member [name=" + name + "]";
		}


	}