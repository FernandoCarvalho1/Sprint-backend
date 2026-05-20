package com.fiap.sprint.backend.service;

import com.fiap.sprint.backend.model.Sensor;
import com.fiap.sprint.backend.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SensorService {

    @Autowired
    private SensorRepository repository;

    public Sensor salvar(Sensor sensor) {
        return repository.save(sensor);
    }

    public List<Sensor> listarTodos() {
        return repository.findAll();
    }

    public Optional<Sensor> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Sensor atualizar(Long id, Sensor sensorAtualizado) {
        Sensor sensor = repository.findById(id).orElseThrow();

        sensor.setNome(sensorAtualizado.getNome());
        sensor.setTipo(sensorAtualizado.getTipo());
        sensor.setLocalizacao(sensorAtualizado.getLocalizacao());
        sensor.setStatus(sensorAtualizado.getStatus());

        return repository.save(sensor);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}