package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Esta clase sirve para utilizarla como herramienta de Agenda para los contactos.
 * @author Jose Francisco Lozano
 * @version 1.0 04/03/2024
 */
public class Agenda {
    /**
     * Atributo de la clase Agenda. Se trata de una Lista de contactos en la que guardaremos los contactos con su nombre
     * y teléfono
     */
    private List<Persona> contacts; // Lista de Contacto

    /**
     * Método constructor de la clase Agenda, en la que asignamos un Array al atributo "Contacts".
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Este método se utiliza para añadir contactos al programa.
     * @param name string que representa el nombre del contacto.
     * @param phone string que representa el numero de teléfono del contacto.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Este método se utiliza para eliminar contactos del programa.
     * @param name string que representa el nombre del contacto
     */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Mediante este método podemos cambiar el número de teléfono de un contacto ya creado por otro número nuevo.
     * @param name string que representa el nombre del contacto.
     * @param oldPhone string que representa el número de teléfono antiguo que queremos cambiar.
     * @param newPhone string que representa el número de teléfono nuevo que queremos utilizar.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Con este método, obtenemos los contactos que tenemos almacenados
     * @return una lista de contactos almacenados en el programa.
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}