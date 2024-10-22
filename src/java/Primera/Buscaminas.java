package Primera;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Buscaminas extends JFrame {

    private final int filas = 10;
    private final int columnas = 10;
    private final int minas = 40;
    private JButton[][] botones = new JButton[filas][columnas];  // Botones
    private int[][] tablero = new int[filas][columnas]; // Tablero

    public Buscaminas() {
        setTitle("Buscaminas Básico");
        setSize(1200, 1200);  // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configuración del panel que contiene los botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(filas, columnas));

        generarMinas(tablero, minas);
        actualizarMinas(tablero);

        // Creación de los botones
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                botones[i][j] = new JButton();  // Crear un nuevo botón
                panel.add(botones[i][j]);  // Agregar el botón al panel

                int fila = i;
                int columna = j;

                botones[fila][columna].setBackground(new Color(250, 250, 250)); // Cambia el fondo del botón a un color RGB personalizado

                int color = (250-(tablero[fila][columna]*25));
                
                
                
                if (tablero[fila][columna] != 0) {
                    botones[fila][columna].setText(String.valueOf(tablero[fila][columna]));
                    botones[fila][columna].setFont(new Font("Arial", Font.BOLD, 40)); // Cambia "Arial" por la fuente que prefieras
                    botones[fila][columna].setBackground(new Color(color, color, color)); // Cambia el fondo del botón a un color RGB personalizado

                    if (tablero[fila][columna] == 9) {
                        botones[fila][columna].setText("X");
                        botones[fila][columna].setBackground(new Color(250, 106, 20)); // Cambia el fondo del botón a un color RGB personalizado

                    }
                }

                // Añadir un ActionListener a cada botón para detectar clics
                botones[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Si hay una mina, mostrar "X", si no, mostrar el número
                        if (tablero[fila][columna] == 9) {
                            botones[fila][columna].setText("X");
                            botones[fila][columna].setBackground(new Color(135, 206, 250)); // Cambia el fondo del botón a un color RGB personalizado

                            JOptionPane.showMessageDialog(null, "¡Perdiste! Había una mina.");
                        } else {
                            botones[fila][columna].setText(String.valueOf(tablero[fila][columna]));
                        }
                    }
                });
            }
        }

        // Agregar el panel a la ventana
        add(panel);
        setVisible(true);  // Mostrar la ventana
    }

    // Método para generar minas aleatoriamente en el tablero
    private void generarMinas(int[][] map, int cantidadMinas) {
        Random rand = new Random();
        int minasColocadas = 0;

        while (minasColocadas < cantidadMinas) {
            int fila = rand.nextInt(map.length);
            int columna = rand.nextInt(map[0].length);

            if (map[fila][columna] != 9) {
                map[fila][columna] = 9;
                minasColocadas++;
            }
        }
    }

    // Método para contar las minas vecinas y actualizar el tablero
    private void actualizarMinas(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 9) {
                    int cont = 0;

                    // Revisar todas las celdas vecinas
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int ni = i + di;
                            int nj = j + dj;

                            // Comprobar si la celda vecina está dentro de los límites y es una mina
                            if (ni >= 0 && ni < map.length && nj >= 0 && nj < map[ni].length) {
                                if (map[ni][nj] == 9) {
                                    cont++;
                                }
                            }
                        }
                    }
                    map[i][j] = cont; // Asignar el número de minas vecinas
                }
            }
        }
    }

    public static void main(String[] args) {
        // Iniciar la aplicación
        new Buscaminas();
    }
}
