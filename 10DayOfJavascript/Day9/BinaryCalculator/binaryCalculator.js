  function onButton(e){
      var btn=e.target || e.srcElement ;
      var action= document.getElementById(btn.id).innerHTMl;
      var res=document.getElementById('res');
      
      switch(action){
          case 'C':
          res.innerHTML='';
          break;
              
          case '=':
          var exp= res.innerHTML;
          var num= /(\d+)/g;
          exp= exp.replace(num, function(match){
                  return parseInt(match,2);
              })
             res.innerHTML=Math.floor(eval(exp)).toString(2);
          break;
          default:
              console.log('should not executed')
              break;
      }
}

var buttons=document.getElmentByTagName('button');
for(let button of buttons){
    button.onClick=onButton;
}