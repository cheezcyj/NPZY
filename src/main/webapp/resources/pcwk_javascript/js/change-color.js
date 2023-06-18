  /* Event 감지 */
  
  let heading = document.querySelector("#heading");
  
  heading.onclick = function(){
	  console.log('heading.onclick');
	  heading.style.color = "red";
  }