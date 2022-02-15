/**
 * A Review is a restaurant review sheet to record the person who submits the form and the restaurant id.
 *
 * Review contains list of overall score and allergy scores such as peanut, egg and dairy, as well as comment submitted by a user.
 *
 * Once the review is submitted, the status remains as pending until admin approves or rejects it.
 */
package com.diningReview.SpringBootDining_Review_API.model;

public class Review {

    private Long id;

    private String username;

    private Long restaurantId;

    private int score;

    private int peanutScore;

    private int eggScore;

    private int dairyScore;

    private String comment;

    private ReviewStatus reviewStatus;
}
