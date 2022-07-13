
<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" uri="urn:jsptagdir:/WEB-INF/tags"%>

<acme:form>
	<acme:input-textbox code="any.artefact.form.label.type" path="type"/>
	<acme:input-textbox code="any.artefact.form.label.name" path="name"/>
	<acme:input-textbox code="any.artefact.form.label.code" path="code"/>	
	<acme:input-textbox code="any.artefact.form.label.technology" path="technology"/>
	<acme:input-textarea code="any.artefact.form.label.description" path="description"/>	
	<acme:input-money code="any.artefact.form.label.retail-price" path="retailPrice"/>
	<acme:input-money code="any.artefact.form.label.money-exchange" path="moneyExchange"/>
	<acme:input-url code="any.artefact.form.label.more-info" path="moreInfo"/>	
</acme:form>