var n = document.getElementById("nicole");
var n = document.getElementById("andrea");
var n = document.getElementById("adel");
var n = document.getElementById("jazmine");
var n = document.getElementById("olivia");
var n = document.getElementById("margaret");
var n = document.getElementById("john");
var n = document.getElementById("rati");

document.querySelector('#color').addEventListener('change', function(event){
	sortColor(event.target.value);
});

function sortColor(sortValue){
	if (sortValue === 'black'){
		nicole.style.display = "none";
		andrea.style.display = "none";
		adel.style.display = "block";
		jazmine.style.display = "none";
		olivia.style.display = "none";
		margaret.style.display = "none";
		john.style.display = "none";
		rati.style.display = "none";
	}
	else if(sortValue === 'blue'){
		nicole.style.display = "block";
		andrea.style.display = "none";
		adel.style.display = "none";
		jazmine.style.display = "none";
		olivia.style.display = "block";
		margaret.style.display = "none";
		john.style.display = "block";
		rati.style.display = "none";
	}
	else if(sortValue === 'purple'){
		nicole.style.display = "none";
		andrea.style.display = "block";
		adel.style.display = "none";
		jazmine.style.display = "block";
		olivia.style.display = "none";
		margaret.style.display = "block";
		john.style.display = "none";
		rati.style.display = "block";
	}
	else{
		nicole.style.display = "block";
		andrea.style.display = "block";
		adel.style.display = "block";
		jazmine.style.display = "block";
		olivia.style.display = "block";
		margaret.style.display = "block";
		john.style.display = "block";
		rati.style.display = "block";
	}
}

document.querySelector('#price').addEventListener('change', function(event){
	sortPrice(event.target.value);
});

function sortPrice(sortValue){
	if (sortValue === 'low'){
		nicole.style.display = "block";
		andrea.style.display = "none";
		adel.style.display = "none";
		jazmine.style.display = "none";
		olivia.style.display = "none";
		margaret.style.display = "block";
		john.style.display = "block";
		rati.style.display = "none";
	}
	else if(sortValue === 'med'){
		nicole.style.display = "none";
		andrea.style.display = "block";
		adel.style.display = "none";
		jazmine.style.display = "none";
		olivia.style.display = "block";
		margaret.style.display = "none";
		john.style.display = "none";
		rati.style.display = "none";
	}
	else if(sortValue === 'high'){
		nicole.style.display = "none";
		andrea.style.display = "none";
		adel.style.display = "block";
		jazmine.style.display = "block";
		olivia.style.display = "none";
		margaret.style.display = "none";
		john.style.display = "none";
		rati.style.display = "block";
	}
	else{
		nicole.style.display = "block";
		andrea.style.display = "block";
		adel.style.display = "block";
		jazmine.style.display = "block";
		olivia.style.display = "block";
		margaret.style.display = "block";
		john.style.display = "block";
		rati.style.display = "block";
	}
}