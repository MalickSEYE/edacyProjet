package model;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Talent t = new Talent("seye", "Malick", 29, "master 2","java");
		t.print();
		TalentForeign tf = new TalentForeign("seye", "Malick", 29, "master 2","java","Mali");
		tf.print();
		School ucad = new School();
		ucad.addTalent(t);
	}

}
