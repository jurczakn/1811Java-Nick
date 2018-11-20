/**
 * 
 */
//old way of doing things
function myFunc(vari) {
	console.warn('stuff about warnings')
}

//new way
let buttonOne = document.getElementById('button');
buttonOne.addEventListener('click', myFuncTwo);

function myFuncTwo(eve){
//	console.log(eve.target); //displays target element
//	console.log(eve.clientX); //mouse position
//	console.log(eve.clientY);
//	console.log(eve.offsetX); //mouse position in respect to the element
//	console.log(eve.offsetY); 
	console.log(eve.altKey); //eve.ctrlKey, shiftKey
}


//other events: click, dblclick, mouseup, mousedown
//mouseenter, mouseleave, mousemove
//mouseover, mouseout

function myFuncThree(eveThree) {
	console.log(eveThree.type);
}

buttonOne.addEventListener('mouseenter', myFuncThree);
