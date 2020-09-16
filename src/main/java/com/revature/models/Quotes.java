package com.revature.models;

public class Quotes {
	

		private int userId;
		private String authorFN;
		private String authorLN;
		private String authorQuote;
		

		public Quotes() {
			super();
			
		}
		
		
		
		public Quotes(int userId, String authorFN, String authorLN, String authorQuote) {
			super();
			this.userId = userId;
			this.authorFN = authorFN;
			this.authorLN = authorLN;
			this.authorQuote = authorQuote;
		}



		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getAuthorFN() {
			return authorFN;
		}
		public void setAuthorFN(String authorFN) {
			this.authorFN = authorFN;
		}
		public String getAuthorLN() {
			return authorLN;
		}
		public void setAuthorLN(String authorLN) {
			this.authorLN = authorLN;
		}
		public String getAuthorQuote() {
			return authorQuote;
		}
		public void setAuthorQuote(String authorQuote) {
			this.authorQuote = authorQuote;
		}


		@Override
		public String toString() {
			return "Quotes [userId=" + userId + ", authorFN=" + authorFN + ", authorLN=" + authorLN + ", authorQuote="
					+ authorQuote + "]";
		}



		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((authorFN == null) ? 0 : authorFN.hashCode());
			result = prime * result + ((authorLN == null) ? 0 : authorLN.hashCode());
			result = prime * result + ((authorQuote == null) ? 0 : authorQuote.hashCode());
			result = prime * result + userId;
			return result;
		}



		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Quotes other = (Quotes) obj;
			if (authorFN == null) {
				if (other.authorFN != null)
					return false;
			} else if (!authorFN.equals(other.authorFN))
				return false;
			if (authorLN == null) {
				if (other.authorLN != null)
					return false;
			} else if (!authorLN.equals(other.authorLN))
				return false;
			if (authorQuote == null) {
				if (other.authorQuote != null)
					return false;
			} else if (!authorQuote.equals(other.authorQuote))
				return false;
			if (userId != other.userId)
				return false;
			return true;
		}
		
		
	}

}
