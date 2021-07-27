package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataTransaction {
    @JsonProperty("campaign status")
    private String campaign_status;

    public String getCampaign_status() {
        return campaign_status;
    }

    public void setCampaign_status(String campaign_status) {
        this.campaign_status = campaign_status;
    }
}
