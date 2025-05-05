package aipersonalisedlearning.creational_patterns.prototype;

import java.util.Date;

public class Recommendation implements Cloneable {
    private String recommendationId;
    private String userId;
    private String contentId;
    private Date suggestedDate;

    public Recommendation(String recommendationId, String userId, String contentId) {
        this.recommendationId = recommendationId;
        this.userId = userId;
        this.contentId = contentId;
        this.suggestedDate = new Date();
    }

    @Override
    public Recommendation clone() {
        try {
            return (Recommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning failed.");
        }
    }

    public String getRecommendationId() {
        return recommendationId;
    }

    public String getUserId() {
        return userId;
    }

    public String getContentId() {
        return contentId;
    }

    public Date getSuggestedDate() {
        return suggestedDate;
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "recommendationId='" + recommendationId + '\'' +
                ", userId='" + userId + '\'' +
                ", contentId='" + contentId + '\'' +
                ", suggestedDate=" + suggestedDate +
                '}';
    }
}
