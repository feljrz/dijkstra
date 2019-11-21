/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algoritimodijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author felipe
 */
public class Vertice {

    protected String nome;
    protected Integer distanciaTotal = Integer.MAX_VALUE;
    protected List<Vertice> menorCaminho = new LinkedList<>();
    Map<Vertice, Integer> verticesAdjacentes = new HashMap<>();

    Vertice pai;

    public Vertice getPai() {
        return pai;
    }

    public void setPai(Vertice pai) {
        this.pai = pai;
    }

    public void addAdjacente(Vertice v, Integer distancia) {
        verticesAdjacentes.put(v, distancia);
    }

    public Map<Vertice, Integer> getAdjacentes() {
        return this.verticesAdjacentes;
    }

    public Vertice(String nome) {
        this.nome = nome;
    }

    public Vertice() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(Integer distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public List<Vertice> getMenorCaminho() {
        return menorCaminho;
    }

    public void setMenorCaminho(List<Vertice> menorCaminho) {
        this.menorCaminho = menorCaminho;
    }

    public String toString() {
        StringBuilder a = new StringBuilder();
        a.append("Nome: " + this.getNome());
        a.append("Menor Caminho: ");
        for (Vertice v : this.getMenorCaminho()) {
            a.append(v.getNome());
        }

        return a.toString();
    }

}
