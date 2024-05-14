/******
Name: Andrew Jenson
Assignment: Final Project - Habit App
Date: April 16, 2024
Notes: An category-related enum (None, Personal, Work, etc.). 
******/


/* COMPOSITION: One object 'HAS' (or is part of) another object.
 * 
 * A 'Premium Habit' has a 'Category' (a 'Category' is part of a 'Premium Habit').
 * */

public enum CategoryModel {
	NONE, // Default
	PERSONAL,
	WORK,
	SCHOOL,
	DIET,
	EXERCISE,
	RELATIONSHIP,
	FAMILY,
	WEALTH
}
