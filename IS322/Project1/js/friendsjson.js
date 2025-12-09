// Makes Friend Gallery Object
function Gallery(path, name, age, gender, hobbies, study, color, desc, price) {
    this.image = path;
    this.name = name;
	this.age = age;
	this.gender = gender;
	this.hobbies = hobbies;
	this.study = study;
	this.color = color;
	this.desc = desc;
	this.price = price;
}

//$GET request
function getQueryParams(qs) {
    qs = qs.split("+").join(" ");
    var params = {},
    tokens,
    re = /[?&]?([^=]+)=([^&]*)/g;
    while (tokens = re.exec(qs)) {
        params[decodeURIComponent(tokens[1])]
 = decodeURIComponent(tokens[2]);
 }
 return params;
}
var $_GET = getQueryParams(document.location.search + '');

//Array holding Gallery objects
var mFriends = [];

var mURL = "";
if ($_GET["json"]){
    mURL = $_GET["json"];
}else{
   mURL = "friends.json"; 
}

//Request JSON File Data
var mRequest = new XMLHttpRequest();
mRequest.onreadystatechange = function() {
    if (mRequest.readyState == 4 && mRequest.status == 200) {
        try {
            mJson = JSON.parse(mRequest.responseText);
            for(var i = 0; i < mJson.friends.length; i++) { 
                var img = mJson.friends[i].imgPath;
                var name = mJson.friends[i].name;
				var age = mJson.friends[i].age;
				var gender = mJson.friends[i].gender
				var hobby = mJson.friends[i].hobbies;
				var study = mJson.friends[i].study;
				var color = mJson.friends[i].color;
                var desc = mJson.friends[i].description;
				var price = mJson.friends[i].price;
                mFriends.push(new Gallery(img, name, age, gender, hobby, study, color, desc, price));
            }
            console.log(mJson);
        } catch(err) {
            console.log(err.message);
        }
    }
};
mRequest.open("GET",mURL, true);
mRequest.send();

(function(){
	document.write(mFriends[2].name);
	
	document.write('<div class="cardArea"><div class="row"');
	
	
	
	document.write('</div></div>');
})();