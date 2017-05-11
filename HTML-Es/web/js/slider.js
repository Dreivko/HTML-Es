/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function (){
//    alert($);
    var SliderModule = (function(){
       var pb = {};
       pb.el = $('#sliderul');
       pb.items = {
           panel: pb.el.find('li')
       };
       
       var SliderInterval,
           currentSlider = 0,
           nextSlider = 1,
           lenghtSlider = pb.items.panel.length; 
       
       pb.init = function(settings){
           var output = '';
           //console.log('Inicializando');
           SliderInit();
           
           for(var i = 0; i < lenghtSlider; i++){
               if(i === 0){
                   output += '<li class="active"></li>';
               }else{
                   output += '<li></li>';
               }
           }
           //console.log(output);
           $('#slider-controls').html(output).on('click','li',function(e){
               var $this = $(this);
               if(currentSlider !== $this.index()){
                   changePanel($this.index());
               }
               //console.log($this.index());
           });
       };
       
       var SliderInit = function(){
            SliderInterval = setInterval(pb.startSlider,5000);
            
       };
       
       pb.startSlider = function(){
            var panels = pb.items.panel,
                controls = $('#slider-controls li');
            
           //console.log('Mensaje');
            if(nextSlider >= lenghtSlider){
              nextSlider = 0;  
              currentSlider = lenghtSlider - 1;
            }
            //console.log(nextSlider);
            
            controls.removeClass('active').eq(nextSlider).addClass('active');
            panels.eq(currentSlider).fadeOut('slow');
            panels.eq(nextSlider).fadeIn('slow');
             
            
            currentSlider = nextSlider;
            nextSlider += 1;
       };
       
       var changePanel = function(id){
            clearInterval(SliderInterval);
            var panels = pb.items.panel,
                controls = $('#slider-controls li');
            if(id >= lenghtSlider){
                id = 0;
            }else if(id < 0 ){
                id = lenghtSlider - 1;
            }
            controls.removeClass('active').eq(id).addClass('active'); 
            panels.eq(currentSlider).fadeOut('slow');
            panels.eq(id).fadeIn('slow');
             
            currentSlider = id;
            nextSlider = id + 1;
            
            SliderInit();
       };
       
       
       
       return pb;
    }());
    SliderModule.init();
});

