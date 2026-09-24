package com.example.CandidatosTSE.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Candidato {
    private String sqCandidato;
    private String nrCandidato;
    private String nomeCandidato;
    private String nomeUrna;
    private String cargo;
    private String siglaPartido;
    private String nomePartido;
    private String uf;
    private String municipio;
    private String situacaoCandidatura;
    private String genero;
    private String grauInstrucao;
    private String ocupacao;
    private String dtNascimento;
    private String nrCpfCandidato;
    private String sqCandidatoParaFoto;

    public String getSqCandidato(){return sqCandidato;}
    public void setSqCandidato(String v){sqCandidato=v;}
    public String getNrCandidato(){return nrCandidato;}
    public void setNrCandidato(String v){nrCandidato=v;}
    public String getNomeCandidato(){return nomeCandidato;}
    public void setNomeCandidato(String v){nomeCandidato=v;}
    public String getNomeUrna(){return nomeUrna;}
    public void setNomeUrna(String v){nomeUrna=v;}
    public String getCargo(){return cargo;}
    public void setCargo(String v){cargo=v;}
    public String getSiglaPartido(){return siglaPartido;}
    public void setSiglaPartido(String v){siglaPartido=v;}
    public String getNomePartido(){return nomePartido;}
    public void setNomePartido(String v){nomePartido=v;}
    public String getUf(){return uf;}
    public void setUf(String v){uf=v;}
    public String getMunicipio(){return municipio;}
    public void setMunicipio(String v){municipio=v;}
    public String getSituacaoCandidatura(){return situacaoCandidatura;}
    public void setSituacaoCandidatura(String v){situacaoCandidatura=v;}
    public String getGenero(){return genero;}
    public void setGenero(String v){genero=v;}
    public String getGrauInstrucao(){return grauInstrucao;}
    public void setGrauInstrucao(String v){grauInstrucao=v;}
    public String getOcupacao(){return ocupacao;}
    public void setOcupacao(String v){ocupacao=v;}
    public String getDtNascimento(){return dtNascimento;}
    public void setDtNascimento(String v){dtNascimento=v;}
    public String getNrCpfCandidato(){return nrCpfCandidato;}
    public void setNrCpfCandidato(String v){nrCpfCandidato=v;}
    public void setSqCandidatoParaFoto(String v){sqCandidatoParaFoto=v;}

    public String getNomeArquivoFoto(){
        String sq=sqCandidatoParaFoto!=null?sqCandidatoParaFoto:sqCandidato;
        return "FMG"+sq+"_div.jpg";
    }

    public int getIdade(){
        if(dtNascimento==null||dtNascimento.isBlank()) return -1;
        try{
            LocalDate n=LocalDate.parse(dtNascimento,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return Period.between(n,LocalDate.now()).getYears();
        }catch(DateTimeParseException e){return -1;}
    }
}
