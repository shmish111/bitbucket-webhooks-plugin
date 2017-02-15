package nl.topicus.bitbucket.events;

import nl.topicus.bitbucket.model.pullrequest.BitbucketServerPullRequest;
import nl.topicus.bitbucket.model.repository.BitbucketServerRepository;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BitbucketServerPullRequestParticipantApprovedEvent {
    private BitbucketServerPullRequest pullrequest;

    private BitbucketServerRepository repository;

    public BitbucketServerPullRequest getPullrequest()
    {
        return pullrequest;
    }

    public void setPullrequest(BitbucketServerPullRequest pullrequest)
    {
        this.pullrequest = pullrequest;
    }

    public BitbucketServerRepository getRepository()
    {
        return repository;
    }

    public void setRepository(BitbucketServerRepository repository)
    {
        this.repository = repository;
    }
}
