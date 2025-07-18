package com.example.pruebanoticia.;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Noticia {
    private String categoria;
    private String titulo;
    private String fecha;
    private String url;
    private String urlImagen;
    public Noticia(JSONObject a) throws JSONException {

        categoria = a.getString("categoria").toString() ;
        titulo= a.getString("nTitular").toString() ;
        String url = "https://uteq.edu.ec/assets/images/news/pagina/" + a.getString("ntUrlPortada").toString();
        String urlpdf = a.getString("urlpw").toString();
    }
    public static ArrayList<Noticia> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Noticia> revistas = new ArrayList<>();
        for (int i = 0; i < datos.length() && i<20; i++) {
            revistas.add(new Noticia(datos.getJSONObject(i)));
        }
        return revistas;
    }


    public Noticia(String categoria, String titulo, String fecha, String url, String urlImagen) {
        this.categoria = categoria;
        this.titulo = titulo;
        this.fecha = fecha;
        this.url = url;
        this.urlImagen = urlImagen;
    }

    public String getCategoria() { return categoria; }
    public String getTitulo() { return titulo; }
    public String getFecha() { return fecha; }
    public String getUrl() { return url; }
    public String getUrlImagen() { return urlImagen; }
}