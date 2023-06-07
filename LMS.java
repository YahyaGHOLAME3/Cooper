	class LMS {
		private String title;
		private String author;
		private String genre;
		private boolean isAvailable;
		private boolean returned;
		private boolean checkedOut;
		//constructor
		public LMS(String title, String author, String genre) {
			this.title = title;
			this.author = author;
			this.genre = genre;
			this.isAvailable = true;
			this.returned = false;
		}
	
		// Implement getter and setter methods for each attribute
		// TITLE getter and setter
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
	
	
		//AUTHOR getter and setter
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		
		//GENRE getter and setter
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		
		//isAvailable getter and setter
		public boolean isAvailable() {
			return isAvailable;
		}
		public void setAvailable(boolean available){
			isAvailable = available;
		}
		
		//isReturned getter and setter
		public boolean isReturned(){
			return returned;
		}
		public void setReturned(boolean returned) {
			this.returned = returned;
		}
		
		//isCheckedOut getter and setter
	    public boolean isCheckedOut(){
	        return checkedOut;
	    }
	
	    public void setCheckedOut(boolean checkedOut) {
	        this.checkedOut = checkedOut;
	    }
	
	}
	
	
	
	
