package net.msonic.fragmentos;

import java.util.ArrayList;

import android.app.Application;

public class MiApp extends Application {

	
	ArrayList<NoticiaTO> noticias;
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		noticias = new ArrayList<NoticiaTO>();
		
		
		NoticiaTO n1 = new NoticiaTO();
		n1.titulo="<body><h1>M-Sonic</h1></body>";
		n1.notaCorta="<body><p>Desarrollo de aplicaciones m�viles</p></body>";
		n1.notaCompleta="<body><p>Desarrollo de aplicaciones m�viles</p></body>";
		n1.url="http://m-sonic.net/ws/wp-content/uploads/2013/05/Home_03.jpg";
		
		noticias.add(n1);
		
		NoticiaTO n2 = new NoticiaTO();
		n2.titulo="<body><h1>iPhone 5S y sus entra�as: as� es por dentro el nuevo smartphone de Apple [FOTOS]</h1></body>";
		n2.notaCorta="<body><p>iFixit.com es experto en desmantelar y volver a armar equipos con la intenci�n de que sus lectores aprendan el funcionamiento interno del aparato y c�mo repararlo ante eventuales fallas. (Reuters)</p></body>";
		n2.url="http://cde.elcomercio.pe/66/ima/0/0/6/6/8/thumb/668700.jpg";
		n2.notaCompleta="<body><p>Desarrollo de aplicaciones m�viles</p></body>";
		noticias.add(n2);
		
		NoticiaTO n3 = new NoticiaTO();
		n3.titulo="<body><h1>la historia de Nintendo como pionero de los videojuegos a prop�sito del fallecimiento de Hiroshi Yamauchi</h1></body>";
		n3.notaCorta="<body><p>La empresa japonesa creaba mazos de cartas hasta que, en la d�cada de 1970, su entonces presidente decidi� incursionar en el entretenimiento electr�nico. As� naci� la industria �gamer� como la conocemos hoy</p></body>";
		n3.url="http://cde.elcomercio.pe/66/ima/0/0/6/6/8/thumb/668445.jpg";
		n3.notaCompleta="<body><p>Desarrollo de aplicaciones m�viles</p></body>";
		noticias.add(n3);
		
		NoticiaTO n4 = new NoticiaTO();
		n4.titulo="<body><h1>iOS 7 de Apple puede descargarse desde hoy</h1></body>";
		n4.notaCorta="<body><p>Estar� disponible para actualizar en los iPhone (a partir del iPhone 4), los iPad (desde el iPad 2) y iPod Touch de quinta generaci�n. Tambi�n para el iPad mini</p></body>";
		n4.url="http://cde.elcomercio.pe/66/ima/0/0/6/6/7/thumb/667883.jpg";
		n4.notaCompleta="<body><p><strong>Madrid (EFE)</strong>. La compa��a tecnol�gica <a href='http://elcomercio.pe/tag/37819/apple'target='_blank' >Apple</a> publica hoy la nueva versi�n de su sistema operativo m�vil, <a href='http://elcomercio.pe/tag/415034/ios-7'target='_blank' >iOS 7</a>, que supone un importante cambio visual y organizativo y que estar� disponible a lo largo del d�a para la actualizaci�n del iPhone 4, iPad 2 y iPod Touch de quinta generaci�n y modelos superiores, as� como <a href='http://elcomercio.pe/tag/317800/ipad-mini'target='_blank' >iPad mini</a>.</p>" +

	"<p><strong>LO NUEVO</strong><br />La tecnol�gica de Cupertino (California) ha optado por mayor simplicidad visual en iOS 7: la interfaz de usuario tiene un dise�o &#8220;plano&#8221;, un estilo que ya ofrece Windows Phone, <strong>nuevos iconos y una nueva tipograf�a</strong>.</p>" +

	"<p>Se ver�n por primera vez im�genes transl�cidas y el sistema pretende ser m�s limpio y sencillo para los usuarios.</p>" +

	"<p>Las notificaciones de las aplicaciones se han unificado y se podr� acceder a ellas incluso con el dispositivo bloqueado.</p>" +

	"<p>El usuario podr� ver tambi�n un resumen de la previsi�n meteorol�gica, un resumen de eventos y citas pendientes y el estado del tr�fico.</p>" +

	"<p>Deslizando el dedo hacia la parte inferior de la pantalla, los usuarios ir�n a una pantalla de ajustes frecuentes, entre los que se incluyen la selecci�n del modo avi�n, la gesti�n de la conexi�n wifi y de la m�sica, el brillo de pantalla, el reloj, la c�mara, la calculadora y la linterna.</p>" +

	"<p><strong>SIRI Y LA C�MARA</strong><br />El asistente de voz <a href='http://elcomercio.pe/tag/314248/siri'target='_blank' >Siri</a> estar� integrado con el buscador Bing de Microsoft, con la Wikipedia y con Twitter y permitir� que el usuario elija entre voces femeninas y masculinas.</p>" +

	"<p>De momento, las nuevas voces s�lo estar�n disponibles en ingl�s americano, franc�s y alem�n y a lo largo de las pr�ximas semanas se actualizar�n a nuevos idiomas.</p>" +

	"<p>La nueva <a href='http://elcomercio.pe/tag/143704/aplicaciones'target='_blank' >aplicaci�n</a> de c�mara de iOS 7 incluir� filtros y un modo de captura de imagen cuadrada y la app de fotos permitir� que se organicen las im�genes en funci�n del lugar y la fecha en los que fueron tomadas.</p>" +

	"<p>Adem�s, los usuarios podr�n compartir sus �lbumes de fotos con sus contactos, que a su vez podr�n subir sus im�genes a esa colecci�n y comentarlas.</p>" +

	"<p>Las aplicaciones se actualizar�n autom�ticamente y el paso entre &#8220;apps&#8221; ser� m�s visual.</p>" +

	"<p>La navegaci�n por Safari se podr� realizar a pantalla completa.</p>" +

	"<p><strong>ITUNES RADIO</strong><br />Otra de las novedades del sistema operativo es la inclusi�n de iTunes Radio, un servicio de m�sica en &#8220;streaming&#8221; que permitir� acceso gratuito y tambi�n por suscripci�n.</p>" +

	"<p>El servicio de radio en l�nea, con el que Apple competir� de forma directa con Pandora, <strong>tendr� emisoras preestablecidas</strong>, algunas de ellas especializadas en g�neros musicales, pero tambi�n permitir� que los usuarios creen las suyas a partir de sus gustos.</p>" +

	"<p>Por el momento, iTunes Radio s�lo estar� disponible en Estados Unidos, aunque se ir� desplegando de forma gradual en otros pa�ses.</p>" +

	"<p>En total, ser�n 200 las nuevas funcionalidades que incluye iOS 7.</p></body>";
		noticias.add(n4);
		
		
		NoticiaTO n5 = new NoticiaTO();
		n5.titulo="<body><h1>�C�mo Twitter se convirti� en una m�quina de hacer dinero?</h1></body>";
		n5.notaCorta="<body><p>El �tuit promocionado� es la herramienta que ha permitido a la red de microblogging aventurarse a la bolsa de valores</p></body>";
		n5.url="http://cde.elcomercio.pe/66/ima/0/0/6/6/7/thumb/667768.jpg";
		n5.notaCompleta="<body><p>Desarrollo de aplicaciones m�viles</p></body>";
		noticias.add(n5);
		
		
		NoticiaTO n6 = new NoticiaTO();
		n6.titulo="<body><h1>Google compr� Bump, la app para compartir archivos con un solo toque</h1></body>";
		n6.notaCorta="<body><p>La empresa que cre� la popular aplicaci�n se uni� a la compa��a de Mountain View por un monto que podr�a llegar a los US$60 millones</p></body>";
		n6.url="http://cde.elcomercio.pe/66/ima/0/0/6/6/7/thumb/667355.jpg";
		n6.notaCompleta="<body><p>Desarrollo de aplicaciones m�viles</p></body>";
		noticias.add(n6);
		
	}

	
	
}
