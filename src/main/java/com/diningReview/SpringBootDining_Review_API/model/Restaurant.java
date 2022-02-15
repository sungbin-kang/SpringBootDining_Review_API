/***
 * A restaurant have a set of review scores based on those submitted by users. On a scale of 1 to 5, with 5 being the
 * best, a restaurant will have individual scores for food allergies - i.e. peanut, egg and dairy.
 * Each individual score is the average across all the submitted scores for that given category.
 * A restaurant has an overall score, which is the average across all the submitted scores across all
 * the categories.
 */
package com.diningReview.SpringBootDining_Review_API.model;

import java.util.ArrayList;

public class Restaurant {

    private Long id;

    private String name;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private int zip;

    private String country;


    private ArrayList<Integer> scores;

    private ArrayList<Integer> peanutScores;

    private ArrayList<Integer> eggScores;

    private ArrayList<Integer> dairyScores;
}
