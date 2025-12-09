function viewSynopsis(thisID, destination){
			var oFrame = document.getElementById(thisID);
			var strRawContents = oFrame.contentWindow.document.body.childNodes[0].innerHTML;

			var arrLines = strRawContents.split("\n");
			var curLine = "";
			for (var i = 0; i < arrLines.length; i++) {
				curLine = curLine + arrLines[i] + "<br/>";
			}
			document.getElementById(destination).innerHTML = curLine;
		}
   
    var slideIndex = 1;
		showDivs(slideIndex);

    function showSection(thisID) {
    			var i;
					var myID = thisID;
					var x = document.getElementsByClassName("mySlides");
					for (i = 0; i < x.length; i++) {
						if (x[i].id != myID){
							x[i].style.display = "none";
						}
						if (x[i].id == myID){
							x[i].style.display = "block";
						}
					}	
      }