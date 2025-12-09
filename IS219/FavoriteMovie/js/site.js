/* SITE.JS: THIS FILE CONTAINS THE METHODS/FUNCTIONS AND VARIABLES CONTROLLING YOUR SITE
// 
*/

/* NOTE: MOVIES.JSON CONTAINS A LIST OF MOVIES AND ACCOMPANYING METADATA
//    
//    They are in the following format:
//    title (String): the name of the movie
//    iscore (Number): the IMDB score
//    rating (String): the movie's MPAA rating 
//    released (Array): the release date. Note that the order of the array is:  YYYY, MM, DD
//    country (String): the country of production
//    posters (Array): an array of String values with the URL to movie posters (in your img/ directory)
//    imdb (String): the URL to the corresponding IMDB website
//    website (String): the URL to the corresponding official website
//    likes (Number): a fictitious number of user likes
//    dislikes (Number): a fictitious number of user dislikes
//    posterindex (Number): a counter to use with the "posters" array to keep track of the current displayed poster index
//
// FOR STEP 16, ADD THREE OF YOUR OWN FAVORITE MOVIES WITH METADATA TO THE END OF THE JSON FILE LIST
*/


const vue_app = new Vue({
      el: '#app',
      // This automatically imports your movies.json file and puts it into
      //   the variable: movies
      created () {
            fetch('movies.json').then(response => response.json()).then(json => {
                  this.movies = json
            })
      },
      data: {
            // This holds your movies.json data.
            movies: [],

            /* ADD ADDITIONAL VARIABLES FOR STEP 3 HERE */
			title: "IMDB + Nicole's Top 8 Movies",
			owner: "Nicole",
			github: "https://github.com/nicoleortiz/FavoriteMovie"
      },
      methods: {
            /* ADD FUNCTIONS/METHODS FOR STEP 7 HERE */
			makeTextDate(dateArray){
				var year = dateArray[0];
				var month = dateArray[1];
				var day = dateArray[2];
				if (month == 1)
					return "January " + day ", " + year;
				else if (month == 1)
					return "January " + day ", " + year;
				else if (month == 2)
					return "February " + day ", " + year;
				else if (month == 3)
					return "March " + day ", " + year;
				else if (month == 4)
					return "April " + day ", " + year;
				else if (month == 5)
					return "May " + day ", " + year;
				else if (month == 6)
					return "June " + day ", " + year;
				else if (month == 7)
					return "July " + day ", " + year;
				else if (month == 8)
					return "August " + day ", " + year;
				else if (month == 9)
					return "September " + day ", " + year;
				else if (month == 10)
					return "October " + day ", " + year;
				else if (month == 11)
					return "November " + day ", " + year;
				else if (month == 12)
					return "December " + day ", " + year;
				else 
					return "Date Error";
			},
			like(index){
				movies[index].likes++;
			},
			dislike(index){
				movies[index].dislikes++;
			},
			posterClick(index){
				if ((movies[index].posterindex + 1) != movies[index].posterindex.length)
					movies[index].posterindex++;
				else
					movies[index].posterindex = 0;
			},
			var hours = 0;
			timeText(minutes){
				if (minutes >= 60) {
					minutes = minutes-60;
					hours++;
					timeText(minutes);
				}
				else {
					var h = hours;
					hours = 0;
					return h + "h " + minutes + "m";
				}
			}
      }
})
	

