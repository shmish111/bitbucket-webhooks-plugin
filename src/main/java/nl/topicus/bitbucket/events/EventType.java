package nl.topicus.bitbucket.events;

public enum EventType
{
	PULL_REQUEST_CREATED("pullrequest:created"),
	PULL_REQUEST_UPDATED("pullrequest:updated"),
	PULL_REQUEST_ACTIVITY("pullrequest:activity"),
	REPO_PUSH("repo:push"),;

	private final String headerValue;

	EventType(String headerValue)
	{
		this.headerValue = headerValue;
	}

	public String getHeaderValue()
	{
		return headerValue;
	}
}
