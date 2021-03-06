# Dining Review - SpringBoot Project

## Overview

This is a restaurant dining review application.

A user can submit reviews of restaurants and later search for restaurants based on these scores.

An admin can approve or disapprove reviews submitted by a user. Once the review is approved, the score will be reflected in the restaurants score system.

A restaurant will have an overall score reviewed by customers as well as set of review scores based on those submitted by users. On a scale of 1 to 5, with 5 being the best, a restaurant will have individual scores for the following food allergies - i.e. peanut, egg and dairy.


## Prerequisites

- Java
- Spring
- curl


## Models

<img src="" alt="ModelClassDiagram" />

### `Profile`

Attributes:

- id : Long
- username : String
- password : String
- isAdmin : boolean

### `Admin` extends `Profile`

Methods:

+ approve(Review : review)
+ reject(Review : review)

### `User` extends `Profile`


### `Restaurant`

Attributes:

- id : Long
- name
- addressLine1: String
- addressLine2 : String
- city : String
- state : State
- zip : int
- country : String

- scores : ArrayList<Integer>
- peanutScores : ArrayList<Integer>
- eggScores : ArrayList<Integer>
- dairyScores : ArrayList<Integer>

Methods:

+ getAveScore() : float
+ getAvePeanutScore() : float
+ getAveEggScore() : float
+ getAveDairyScore() : float


### `DiningReview`

Attributes:

- id : Long
- username : String
- restaurantID : Long
- score : int
- peanutScore : int
- eggScore : int
- dairyScore : int