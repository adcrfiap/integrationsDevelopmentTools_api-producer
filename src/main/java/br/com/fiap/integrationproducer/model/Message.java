package br.com.fiap.integrationproducer.model;

import lombok.Data;

@Data
public class Message {

      private long idDrone;
      private long latitude;
      private long longitude;
      private long temperatura;
      private long humidade;

      @Override
      public String toString() {
            return "{" +
                    "idDrone=" + idDrone +
                    ", latitude=" + latitude +
                    ", longitude=" + longitude +
                    ", temperatura=" + temperatura +
                    ", humidade=" + humidade +
                    '}';
      }
}
