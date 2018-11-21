function bubble(element, event){
    element.style.backgroundColor = "blue";
    alert(element.id);
}

window.onload = function(){
    document.getElementById("D").addEventListener("click", function(event){bubble(this, event)}, false);
    document.getElementById("C").addEventListener("click", function(event){bubble(this, event)}, false);
    document.getElementById("B").addEventListener("click", function(event){bubble(this, event)}, false);
    document.getElementById("A").addEventListener("click", function(event){bubble(this, event)}, false);
    
}