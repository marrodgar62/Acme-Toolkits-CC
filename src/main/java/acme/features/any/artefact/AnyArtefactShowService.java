package acme.features.any.artefact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.components.ExchangeService;
import acme.entities.artefact.Artefact;
import acme.framework.components.models.Model;
import acme.framework.controllers.Request;
import acme.framework.roles.Any;
import acme.framework.services.AbstractShowService;

@Service
public class AnyArtefactShowService implements AbstractShowService<Any, Artefact>{

	@Autowired
	protected ExchangeService exchangeService;
	
	@Autowired
	protected AnyArtefactRepository repository;
	
	@Override
	public boolean authorise(final Request<Artefact> request) {
		assert request != null;
		return true;
	}

	@Override
	public Artefact findOne(final Request<Artefact> request) {
		assert request != null;

		Artefact result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findArtefactById(id);

		return result;
	}

	@Override
	public void unbind(final Request<Artefact> request, final Artefact entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "type", "name", "code", "technology",
			"description","retailPrice", "moreInfo");
		model.setAttribute("moneyExchange", exchangeService.exchangeMoneySystemConfiguration(entity.getRetailPrice()));
	}

}
