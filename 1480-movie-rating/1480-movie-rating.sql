# Write your MySQL query statement below
(SELECT Users.Name as results
FROM Users JOIN MovieRating
ON Users.user_id = MovieRating.user_id
GROUP BY MovieRating.user_id
ORDER BY count(MovieRating.user_id) DESC, Users.Name ASC
LIMIT 1)

UNION ALL

(SELECT title AS results
FROM MovieRating JOIN Movies USING(movie_id)
WHERE EXTRACT(YEAR_MONTH FROM created_at) = 202002
GROUP BY title
ORDER BY AVG(rating) DESC, title
LIMIT 1);