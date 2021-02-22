function toggleLight() {
   console.log("toggling light");
   var imageVar = document.getElementById("bulb");
   if (imageVar.src.match("bulbon")) {
     imageVar.src = "https://www.w3schools.com/js/pic_bulboff.gif";
   } else {
     imageVar.src = "https://www.w3schools.com/js/pic_bulbon.gif";
   }
 }
 function toggleLight1() {
   console.log("toggling light");
   var imageVar = document.getElementById("bulb1");
   if (imageVar.src.match("bulbon")) {
     imageVar.src = "https://www.w3schools.com/js/pic_bulboff.gif";
   } else {
     imageVar.src = "https://www.w3schools.com/js/pic_bulbon.gif";
   }
 }