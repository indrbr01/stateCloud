
<html>
    <head>
        <meta name="layout" content="main">
        <title>State Cloud</title>
    </head>
    <body>
      <div id="cloudDiv">
        <g:if test="${stateMap.size() == 0}">No State Data Found</g:if>
        <g:else>
          <tc:tagCloud tags="${stateMap}" size="${[start: 10, end: 40, unit: 'px']}"/>
        </g:else>
      </div>
      <div id="linkDiv">
        <g:link controller="state" action="getTags">Get/refresh Tags</g:link>
        <g:link controller="state" action="deleteTags">Delete Tags</g:link>
      </div>
    </body>
</html>
