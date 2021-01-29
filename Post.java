package Labs;
import java.util.Date;

public class Post {
	private String strAuthor;
	private Date dateCreated;
	private String strTitle;
	private String strBody;
	private String[] strComments;
	
	public Post() {
		strComments = new String[100];
	}
	
	public Post(String strAuthor, Date dateCreated, String strTitle, String strBody) {
		this.strAuthor = strAuthor;
		this.dateCreated = dateCreated;
		this.strTitle = strTitle;
		this.strBody = strBody;
		strComments = new String[100];
	}

	public String getStrAuthor() {
		return strAuthor;
	}

	public void setStrAuthor(String strAuthor) {
		this.strAuthor = strAuthor;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getStrTitle() {
		return strTitle;
	}

	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}

	public String getStrBody() {
		return strBody;
	}

	public void setStrBody(String strBody) {
		this.strBody = strBody;
	}

	public String[] getStrComments() {
		return strComments;
	}

	public void addComment(String strComment) {
		for (int i = 0; i < this.strComments.length; i++) {
			if (this.strComments[i] == null) {
				strComments[i] = strComment;
				return;
			}
			
		}
		System.out.println("Cannot add any more comments.");
	}
	
	

}
