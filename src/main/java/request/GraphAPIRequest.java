package request;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;

public class GraphAPIRequest implements Request{
	
	private String ACCESS_TOKEN;
	private String teamId;
	private int option; 
	private String URL;
	private String channelId;
	
	public HttpRequest postRequest(String bodyString) {
		switch (option) {
		case 1:
            // add new members to team
            URL = "https://graph.microsoft.com/v1.0/teams/" + teamId + "/members/add";
            break;
        case 2: // create new channels to team
            URL = "https://graph.microsoft.com/v1.0/teams/" + teamId + "/channels";
            break;
        case 3: // add new members to channel
            URL = "https://graph.microsoft.com/v1.0/teams/" + teamId + "/channels/" + channelId + "/members";
            break;
//        default:
//            throw new IllegalArgumentException("Invalid option: " + option);
		}
		
		BodyPublisher requestBody = BodyPublishers.ofString(bodyString);
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(URL)) // to be modified
				.POST(requestBody)
				.header("Authorization", "Bearer " + ACCESS_TOKEN)
				.header("Content-Type", "application/json")
				.build();
		return request;
	}

	public HttpRequest getRequest() {
		switch (option) {
			case 1: // get members
				URL = "https://graph.microsoft.com/v1.0/teams/" + teamId + "/members";
				break;
			case 2: // get channels
				URL = "https://graph.microsoft.com/v1.0/teams/" + teamId + "/channels";
				break;
			case 3: // get teams
				URL = "https://graph.microsoft.com/v1.0/joinedTeams";
                break;
//            default:
//                throw new IllegalArgumentException("Invalid option: " + option);
		}
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(URL)) // to be modified
				.GET()
				.header("Authorization", "Bearer " + ACCESS_TOKEN)
				.header("Content-Type", "application/json")
				.build();
		return request;
	}

	public void setACCESS_TOKEN(String aCCESS_TOKEN) {
		if (aCCESS_TOKEN == null || aCCESS_TOKEN.isEmpty()) {
            throw new IllegalArgumentException("ACCESS_TOKEN cannot be null or empty");
        }
        ACCESS_TOKEN = aCCESS_TOKEN;
	}

	public void setTeamId(String teamId) {
		if (teamId == null || teamId.isEmpty()) {
            throw new IllegalArgumentException("TeamId cannot be null or empty");
        }
        this.teamId = teamId;
	}
	
	public void setChannelId(String channelId) {
        if (channelId == null || channelId.isEmpty()) {
            throw new IllegalArgumentException("ChannelId cannot be null or empty");
        }
        this.channelId = channelId;
    }
	
	public void setOption(int option) {
		this.option = option;
	}
	
	public int getOption() {
		return option;
	}
}
