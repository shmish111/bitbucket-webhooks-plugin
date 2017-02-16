package nl.topicus.bitbucket.model.repository;

public class BitbucketServerAction
{
	private String action;

	// JSON mapping added in setter because the field can not be called "public"
	private Boolean publc;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
