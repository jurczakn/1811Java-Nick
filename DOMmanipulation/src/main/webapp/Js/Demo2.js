/**
 * 
 */

//DOM - document object model
// it defines the logical structure of documents and the
//way a document is accessed and manipulated.
//HTML document - series of elements, all of which
//can be manipulated


//////////GET ELEMENT BY ID
let paraTwo = document.getElementById('para2');
paraTwo.innerText = 'Timothy has two legs (hopefully)'
	
//console.log(paraTwo.innerText);
paraTwo.innerHTML ='<i> Well, today was not as bad as I thought it would be. <i>'


/////////GET ELEMENT BY CLASS NAME
let hders = document.getElementsByClassName('headers');
console.log(hders);
hders[1].textContent = "The second day";
console.log(hders[1]);
//you can also change styles of your elements with:
//				hders[].style.backgroundColor=....

////////GET ELEMENTS BY TAGNAME
//getElementsByTagName('');
//same as elements by class name




