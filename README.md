<h1>Proyecto Audiovisual</h1>
<h2>Descripci&oacute;n</h2>
<p>Este proyecto es un sistema de gesti&oacute;n de contenido audiovisual desarrollado en Java. Permite la creaci&oacute;n, gesti&oacute;n y almacenamiento de distintos tipos de contenido, incluyendo pel&iacute;culas, series de televisi&oacute;n, documentales, sketches, videos de TikTok, entre otros. Adem&aacute;s, incluye funcionalidades para persistir datos en formato CSV y proporciona una estructura clara para la organizaci&oacute;n y manipulaci&oacute;n de la informaci&oacute;n.</p>
<h2>Estructura del Proyecto</h2>
<p>El proyecto est&aacute; organizado en los siguientes paquetes:</p>
<h3><strong>Paquete <code>uni1a.model</code></strong></h3>
<p>Contiene las clases principales que modelan los elementos del sistema:</p>
<ul>
<li><strong><code>ContenidoAudiovisual</code></strong> <em>(abstract)</em>: Clase base para todos los tipos de contenido audiovisual. Proporciona atributos comunes como t&iacute;tulo, duraci&oacute;n y g&eacute;nero.</li>
<li><strong><code>Pelicula</code></strong>: Representa una pel&iacute;cula, con un atributo adicional <code>director</code>.</li>
<li><strong><code>SerieDeTV</code></strong>: Representa una serie de televisi&oacute;n, con un atributo adicional <code>numeroTemporadas</code>.</li>
<li><strong><code>Temporada</code></strong>: Representa una temporada de una serie, con atributos <code>numero</code> y <code>cantidadEpisodios</code>.</li>
<li><strong><code>Documental</code></strong>: Representa un documental, con un atributo adicional <code>tema</code>.</li>
<li><strong><code>Investigador</code></strong>: Modela a un investigador con atributos como <code>nombre</code> y <code>especialidad</code>.</li>
<li><strong><code>Actor</code></strong>: Representa a un actor con atributos como <code>nombre</code>, <code>edad</code> y <code>nacionalidad</code>.</li>
<li><strong><code>VideoTikTok</code></strong>: Modela un video de TikTok con atributos como <code>id</code>, <code>duracion</code> y <code>hashtags</code>.</li>
<li><strong><code>Sketch</code></strong>: Representa un sketch con atributos como <code>nombre</code>, <code>duracion</code>, <code>tema</code> y una lista de actores.</li>
</ul>
<h3><strong>Paquete <code>uni1a.controller</code></strong></h3>
<p>Incluye clases para la gesti&oacute;n de la persistencia:</p>
<ul>
<li><strong><code>PersistenciaCSV&lt;T&gt;</code></strong> <em>(interface)</em>: Define m&eacute;todos para leer y guardar datos en formato CSV.</li>
<li><strong><code>ArchivoCSVUtil</code></strong>: Utilidad para manejar operaciones de lectura y escritura en archivos CSV.</li>
</ul>
<p>&nbsp;</p>
<h2>Requisitos del Sistema</h2>
<ul>
<li><strong>Java 11</strong> o superior</li>
<li>IDE como IntelliJ IDEA, Eclipse o NetBeans</li>
<li>Biblioteca externa para manipulaci&oacute;n de archivos CSV (si no est&aacute; implementada manualmente).</li>
</ul>
<h2>Configuraci&oacute;n e Instalaci&oacute;n</h2>
<ol>
<li>Clona el repositorio en tu m&aacute;quina local:
<div class="contain-inline-size rounded-md border-[0.5px] border-token-border-medium relative bg-token-sidebar-surface-primary dark:bg-gray-950">
<div class="flex items-center text-token-text-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md h-9 bg-token-sidebar-surface-primary dark:bg-token-main-surface-secondary select-none">bash</div>
<div class="sticky top-9 md:top-[5.75rem]">
<div class="absolute bottom-0 right-2 flex h-9 items-center">
<div class="flex items-center rounded bg-token-sidebar-surface-primary px-2 font-sans text-xs text-token-text-secondary dark:bg-token-main-surface-secondary"><span class="" data-state="closed"><button class="flex gap-1 items-center select-none py-1">Copiar c&oacute;digo</button></span></div>
</div>
</div>
<div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-bash"><code class="!whitespace-pre hljs language-bash">git <span class="hljs-built_in">clone</span>&nbsp;</code></code>
<p><a href="https://github.com/Abeuchiha57/TareaU4.git">https://github.com/Abeuchiha57/TareaU4.git</a></p>
<code class="!whitespace-pre hljs language-bash"></code></div>
</div>
</li>
<li>Abre el proyecto en tu IDE preferido.</li>
<li>Aseg&uacute;rate de que las dependencias necesarias (si las hay) est&eacute;n configuradas.</li>
<li>Compila y ejecuta el proyecto.</li>
</ol>
<h2>Pruebas</h2>
<p>El proyecto incluye pruebas unitarias para validar la funcionalidad de las principales clases. Estas pruebas est&aacute;n disponibles en el paquete <code>uni1a.test</code>.</p>
<h3>Ejecuci&oacute;n de las Pruebas</h3>
<p>Para ejecutar las pruebas:</p>
<ol>
<li>Aseg&uacute;rate de que los archivos de prueba est&eacute;n configurados correctamente.</li>
<li>Ejecuta las pruebas en tu IDE o mediante comandos como:
<div class="contain-inline-size rounded-md border-[0.5px] border-token-border-medium relative bg-token-sidebar-surface-primary dark:bg-gray-950">
<div class="flex items-center text-token-text-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md h-9 bg-token-sidebar-surface-primary dark:bg-token-main-surface-secondary select-none">bash</div>
<div class="sticky top-9 md:top-[5.75rem]">
<div class="absolute bottom-0 right-2 flex h-9 items-center">
<div class="flex items-center rounded bg-token-sidebar-surface-primary px-2 font-sans text-xs text-token-text-secondary dark:bg-token-main-surface-secondary"><span class="" data-state="closed"><button class="flex gap-1 items-center select-none py-1">Copiar c&oacute;digo</button></span></div>
</div>
</div>
<div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-bash">./gradlew <span class="hljs-built_in">test</span>
</code></div>
</div>
</li>
</ol>
<h2>Funcionalidades</h2>
<ul>
<li><strong>Gesti&oacute;n de Contenidos</strong>:
<ul>
<li>Crear, listar y mostrar detalles de pel&iacute;culas, series, documentales, sketches y videos de TikTok.</li>
</ul>
</li>
<li><strong>Persistencia</strong>:
<ul>
<li>Lectura y escritura de datos en formato CSV para todos los tipos de contenido.</li>
</ul>
</li>
<li><strong>Interfaz Flexible</strong>:
<ul>
<li>Implementaci&oacute;n de la interfaz <code>PersistenciaCSV&lt;T&gt;</code> para permitir la persistencia de cualquier tipo de contenido.</li>
</ul>
</li>
</ul>
<h2>Ejemplo de Uso</h2>
<h3>Crear una Pel&iacute;cula</h3>
<div class="contain-inline-size rounded-md border-[0.5px] border-token-border-medium relative bg-token-sidebar-surface-primary dark:bg-gray-950">
<div class="flex items-center text-token-text-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md h-9 bg-token-sidebar-surface-primary dark:bg-token-main-surface-secondary select-none">java</div>
<div class="sticky top-9 md:top-[5.75rem]">
<div class="absolute bottom-0 right-2 flex h-9 items-center">
<div class="flex items-center rounded bg-token-sidebar-surface-primary px-2 font-sans text-xs text-token-text-secondary dark:bg-token-main-surface-secondary"><span class="" data-state="closed"><button class="flex gap-1 items-center select-none py-1">Copiar c&oacute;digo</button></span></div>
</div>
</div>
<div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-java"><span class="hljs-type">Pelicula</span> <span class="hljs-variable">pelicula</span> <span class="hljs-operator">=</span> <span class="hljs-keyword">new</span> <span class="hljs-title class_">Pelicula</span>(<span class="hljs-string">"El Padrino"</span>, <span class="hljs-string">"Francis Ford Coppola"</span>, <span class="hljs-number">175</span>, <span class="hljs-string">"Crimen"</span>);
pelicula.mostrarDetalles();
</code></div>
</div>
<h3>Guardar en CSV</h3>
<div class="contain-inline-size rounded-md border-[0.5px] border-token-border-medium relative bg-token-sidebar-surface-primary dark:bg-gray-950">
<div class="flex items-center text-token-text-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md h-9 bg-token-sidebar-surface-primary dark:bg-token-main-surface-secondary select-none">java</div>
<div class="sticky top-9 md:top-[5.75rem]">
<div class="absolute bottom-0 right-2 flex h-9 items-center">
<div class="flex items-center rounded bg-token-sidebar-surface-primary px-2 font-sans text-xs text-token-text-secondary dark:bg-token-main-surface-secondary"><span class="" data-state="closed"><button class="flex gap-1 items-center select-none py-1">Copiar c&oacute;digo</button></span></div>
</div>
</div>
<div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-java">List&lt;Pelicula&gt; peliculas = Arrays.asList(pelicula);
pelicula.guardarEnCSV(<span class="hljs-string">"peliculas.csv"</span>, peliculas);
</code></div>
</div>
<h3>Leer desde CSV</h3>
<div class="contain-inline-size rounded-md border-[0.5px] border-token-border-medium relative bg-token-sidebar-surface-primary dark:bg-gray-950">
<div class="flex items-center text-token-text-secondary px-4 py-2 text-xs font-sans justify-between rounded-t-md h-9 bg-token-sidebar-surface-primary dark:bg-token-main-surface-secondary select-none">java</div>
<div class="sticky top-9 md:top-[5.75rem]">
<div class="absolute bottom-0 right-2 flex h-9 items-center">
<div class="flex items-center rounded bg-token-sidebar-surface-primary px-2 font-sans text-xs text-token-text-secondary dark:bg-token-main-surface-secondary"><span class="" data-state="closed"><button class="flex gap-1 items-center select-none py-1">Copiar c&oacute;digo</button></span></div>
</div>
</div>
<div class="overflow-y-auto p-4" dir="ltr"><code class="!whitespace-pre hljs language-java">List&lt;Pelicula&gt; peliculasLeidas = pelicula.leerDesdeCSV(<span class="hljs-string">"peliculas.csv"</span>);</code></div>
</div>
