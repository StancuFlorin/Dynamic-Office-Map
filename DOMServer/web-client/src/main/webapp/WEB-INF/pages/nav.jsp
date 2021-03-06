<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-default"> <%--navbar-fixed-top--%>
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value="/#/" />">Dynamic Office Map</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="<c:url value="/#/zones" />">Zones</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <img src="<c:url value="/resources/image/endava.png" />" alt="Logo" />
            </ul>
        </div>
    </div>
</nav>