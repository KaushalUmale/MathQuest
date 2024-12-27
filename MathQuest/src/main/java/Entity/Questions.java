package Entity;

public class Questions {
	 private int id;
	    private String questionText;
	    private String correctAnswer;
		public Questions(int id, String questionText, String correctAnswer) {
			super();
			this.id = id;
			this.questionText = questionText;
			this.correctAnswer = correctAnswer;
		}
		
		public Questions() {
			super();
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getQuestionText() {
			return questionText;
		}
		public void setQuestionText(String questionText) {
			this.questionText = questionText;
		}
		public String getCorrectAnswer() {
			return correctAnswer;
		}
		public void setCorrectAnswer(String correctAnswer) {
			this.correctAnswer = correctAnswer;
		}

	    

}
