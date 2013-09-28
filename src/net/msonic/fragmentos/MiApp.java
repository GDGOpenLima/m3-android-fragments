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
		n1.notaCorta="<body><p>Desarrollo de aplicaciones móviles</p></body>";
		n1.notaCompleta="<body><p>Desarrollo de aplicaciones móviles</p></body>";
		n1.url="http://m-sonic.net/ws/wp-content/uploads/2013/05/Home_03.jpg";
		
		noticias.add(n1);
		
		NoticiaTO n2 = new NoticiaTO();
		n2.titulo="<body><h1>iPhone 5S y sus entrañas: así es por dentro el nuevo smartphone de Apple [FOTOS]</h1></body>";
		n2.notaCorta="<body><p>iFixit.com es experto en desmantelar y volver a armar equipos con la intención de que sus lectores aprendan el funcionamiento interno del aparato y cómo repararlo ante eventuales fallas. (Reuters)</p></body>";
		n2.url="http://cde.elcomercio.pe/66/ima/0/0/6/6/8/thumb/668700.jpg";
		n2.notaCompleta="<body><p>Desarrollo de aplicaciones móviles</p></body>";
		noticias.add(n2);
		
		NoticiaTO n3 = new NoticiaTO();
		n3.titulo="<body><h1>la historia de Nintendo como pionero de los videojuegos a propósito del fallecimiento de Hiroshi Yamauchi</h1></body>";
		n3.notaCorta="<body><p>La empresa japonesa creaba mazos de cartas hasta que, en la década de 1970, su entonces presidente decidió incursionar en el entretenimiento electrónico. Así nació la industria “gamer” como la conocemos hoy</p></body>";
		n3.url="http://cde.elcomercio.pe/66/ima/0/0/6/6/8/thumb/668445.jpg";
		n3.notaCompleta="<body><p>Desarrollo de aplicaciones móviles</p></body>";
		noticias.add(n3);
		
		NoticiaTO n4 = new NoticiaTO();
		n4.titulo="<body><h1>iOS 7 de Apple puede descargarse desde hoy</h1></body>";
		n4.notaCorta="<body><p>Estará disponible para actualizar en los iPhone (a partir del iPhone 4), los iPad (desde el iPad 2) y iPod Touch de quinta generación. También para el iPad mini</p></body>";
		n4.url="http://cde.elcomercio.pe/66/ima/0/0/6/6/7/thumb/667883.jpg";
		n4.notaCompleta="<body><p><strong>Madrid (EFE)</strong>. La compañía tecnológica <a href='http://elcomercio.pe/tag/37819/apple'target='_blank' >Apple</a> publica hoy la nueva versión de su sistema operativo móvil, <a href='http://elcomercio.pe/tag/415034/ios-7'target='_blank' >iOS 7</a>, que supone un importante cambio visual y organizativo y que estará disponible a lo largo del día para la actualización del iPhone 4, iPad 2 y iPod Touch de quinta generación y modelos superiores, así como <a href='http://elcomercio.pe/tag/317800/ipad-mini'target='_blank' >iPad mini</a>.</p>" +

	"<p><strong>LO NUEVO</strong><br />La tecnológica de Cupertino (California) ha optado por mayor simplicidad visual en iOS 7: la interfaz de usuario tiene un diseño &#8220;plano&#8221;, un estilo que ya ofrece Windows Phone, <strong>nuevos iconos y una nueva tipografía</strong>.</p>" +

	"<p>Se verán por primera vez imágenes translúcidas y el sistema pretende ser más limpio y sencillo para los usuarios.</p>" +

	"<p>Las notificaciones de las aplicaciones se han unificado y se podrá acceder a ellas incluso con el dispositivo bloqueado.</p>" +

	"<p>El usuario podrá ver también un resumen de la previsión meteorológica, un resumen de eventos y citas pendientes y el estado del tráfico.</p>" +

	"<p>Deslizando el dedo hacia la parte inferior de la pantalla, los usuarios irán a una pantalla de ajustes frecuentes, entre los que se incluyen la selección del modo avión, la gestión de la conexión wifi y de la música, el brillo de pantalla, el reloj, la cámara, la calculadora y la linterna.</p>" +

	"<p><strong>SIRI Y LA CÁMARA</strong><br />El asistente de voz <a href='http://elcomercio.pe/tag/314248/siri'target='_blank' >Siri</a> estará integrado con el buscador Bing de Microsoft, con la Wikipedia y con Twitter y permitirá que el usuario elija entre voces femeninas y masculinas.</p>" +

	"<p>De momento, las nuevas voces sólo estarán disponibles en inglés americano, francés y alemán y a lo largo de las próximas semanas se actualizarán a nuevos idiomas.</p>" +

	"<p>La nueva <a href='http://elcomercio.pe/tag/143704/aplicaciones'target='_blank' >aplicación</a> de cámara de iOS 7 incluirá filtros y un modo de captura de imagen cuadrada y la app de fotos permitirá que se organicen las imágenes en función del lugar y la fecha en los que fueron tomadas.</p>" +

	"<p>Además, los usuarios podrán compartir sus álbumes de fotos con sus contactos, que a su vez podrán subir sus imágenes a esa colección y comentarlas.</p>" +

	"<p>Las aplicaciones se actualizarán automáticamente y el paso entre &#8220;apps&#8221; será más visual.</p>" +

	"<p>La navegación por Safari se podrá realizar a pantalla completa.</p>" +

	"<p><strong>ITUNES RADIO</strong><br />Otra de las novedades del sistema operativo es la inclusión de iTunes Radio, un servicio de música en &#8220;streaming&#8221; que permitirá acceso gratuito y también por suscripción.</p>" +

	"<p>El servicio de radio en línea, con el que Apple competirá de forma directa con Pandora, <strong>tendrá emisoras preestablecidas</strong>, algunas de ellas especializadas en géneros musicales, pero también permitirá que los usuarios creen las suyas a partir de sus gustos.</p>" +

	"<p>Por el momento, iTunes Radio sólo estará disponible en Estados Unidos, aunque se irá desplegando de forma gradual en otros países.</p>" +

	"<p>En total, serán 200 las nuevas funcionalidades que incluye iOS 7.</p></body>";
		noticias.add(n4);
		
		
		NoticiaTO n5 = new NoticiaTO();
		n5.titulo="<body><h1>¿Cómo Twitter se convirtió en una máquina de hacer dinero?</h1></body>";
		n5.notaCorta="<body><p>El “tuit promocionado” es la herramienta que ha permitido a la red de microblogging aventurarse a la bolsa de valores</p></body>";
		n5.url="http://cde.elcomercio.pe/66/ima/0/0/6/6/7/thumb/667768.jpg";
		n5.notaCompleta="<body><p>Desarrollo de aplicaciones móviles</p></body>";
		noticias.add(n5);
		
		
		NoticiaTO n6 = new NoticiaTO();
		n6.titulo="<body><h1>Google compró Bump, la app para compartir archivos con un solo toque</h1></body>";
		n6.notaCorta="<body><p>La empresa que creó la popular aplicación se unió a la compañía de Mountain View por un monto que podría llegar a los US$60 millones</p></body>";
		n6.url="http://cde.elcomercio.pe/66/ima/0/0/6/6/7/thumb/667355.jpg";
		n6.notaCompleta="<body><p>Desarrollo de aplicaciones móviles</p></body>";
		noticias.add(n6);
		
	}

	
	
}
