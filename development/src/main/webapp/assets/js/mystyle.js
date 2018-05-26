$(function (){
	switch(menu){
	case 'View Doctors':
			$('#doctors').addClass('active');
			break;
	case 'Medical Services':
		$('#services').addClass('active');
		break;
	case 'Ambulance':
		$('#ambulance').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'All Doctors':
		$('#doctors').addClass('active');
		break;
	default :
		$('#doctors').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	
	}
	
});