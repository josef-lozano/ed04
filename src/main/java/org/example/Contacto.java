package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase se encargar de inicializar cada contacto para después guardarlo en la Agenda.
 * Contiene el atributo "name" que es la string para el nombre del contacto y el atributo "phone" que será una lista de
 * tipo String para los números de teléfono del contacto.
 * @author Jose Francisco
 * @version 1.0 04/03/2024
 */
class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Método constructor para la clase Contacto.
     * @param name string que identifica el nombre del contacto.
     * @param phone string que identifica el número que se introducirá en la lista de teléfonos del contacto.
     */
    public Contacto(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Método get para obtener el nombre del contacto fuara de la clase Contacto.
     * @return string con el nombre del contacto.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Método get para obtener el listado de teléfonos del contacto.
     * @return lista de tipo string con los teléfonos del contacto.
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}