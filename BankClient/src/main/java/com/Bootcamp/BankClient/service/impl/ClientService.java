package com.Bootcamp.BankClient.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bootcamp.BankClient.domain.Client;
import com.Bootcamp.BankClient.repository.ClientRepository;
import com.Bootcamp.BankClient.service.IClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service

public class ClientService implements IClientService {
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Flux<Client> findAll() throws Exception {

		return clientRepository.findAll().filter(person -> person.getState() == 1).switchIfEmpty(Mono.error(new Throwable("No se encontraron resultados")));
	}

	@Override
	public Mono<Client> findById(String id) throws Exception {

		return clientRepository.findById(id).switchIfEmpty(Mono.error(new Throwable("No se encontraron resultados")));
	}

	@Override
	public Mono<Client> create(Client client) throws Exception {
		Flux<Client> listClientExist = clientRepository.findByNumberDocument(client.getNumberDocument());
		
			if (listClientExist.next() != null) {
				return Mono.error(new Throwable("El cliente ya existe"));
			}
			return clientRepository.save(client);
	}

	@Override
	public Mono<Client> update(String id, Client client) throws Exception {
		return clientRepository.findById(id).switchIfEmpty(Mono.error(() -> new Throwable("No existe cliente")))
				.flatMap(t -> clientRepository.save(client));
	}

	@Override
	public Mono<Void> deleteById(String id) throws Exception {
		return clientRepository.deleteById(id);
	}

	@Override
	public Flux<Client> findByNumberDocument(String numberDocument) throws Exception {

		return clientRepository.findByNumberDocument(numberDocument);

	}
}
