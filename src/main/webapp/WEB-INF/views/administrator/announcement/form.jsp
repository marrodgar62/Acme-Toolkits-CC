
<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" uri="urn:jsptagdir:/WEB-INF/tags"%>

<acme:form>
	<acme:input-textbox readonly="true" code="administrator.announcement.form.label.creation" path="creation"/>
	<acme:input-textbox code="administrator.announcement.form.label.title" path="title"/>
	<acme:input-textbox code="administrator.announcement.form.label.body" path="body"/>	
	<acme:input-select code="administrator.announcement.form.label.flag" path="flag">
		<acme:input-option code="true" value="true" />
		<acme:input-option code="false" value="false" />
	</acme:input-select>
	<acme:input-url code="administrator.announcement.form.label.url" path="url"/>	
		
	<acme:input-checkbox code="administrator.announcement.form.label.confirmation" path="confirmation"/>
	
	<acme:submit code="administrator.announcement.form.button.create" action="/administrator/announcement/create"/>
</acme:form>

