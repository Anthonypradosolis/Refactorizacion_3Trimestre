package dam.refactorizacion;

public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     * @param pointsPlayer1 puntos del primer jugaodr
     * @param pointsPlayer2 puntos del segundo jugador
     * @return puntuacion
     */
    public static String getScore(int pointsPlayer1, int pointsPlayer2) {
        String score = "";

        if (pointsPlayer1 == pointsPlayer2) {
            switch (pointsPlayer1)
            {
                case 0:
                    return "Love-All";
                case 1:
                    return "Fifteen-All";
                case 2:
                    return "Thirty-All";
                case 3:
                    return "Forty-All";
                default:
                    return "Deuce";
            }
        }
        else if (pointsPlayer1 >=4 || pointsPlayer2 >=4)
        {
            int diferenciaDePuntos = pointsPlayer1-pointsPlayer2;
            if (diferenciaDePuntos==1) score ="Advantage player1";
            else if (diferenciaDePuntos ==-1) score ="Advantage player2";
            else if (diferenciaDePuntos>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            int resultadoTemporal=0;
            for (int i=1; i<3; i++)
            {
                if (i==1) resultadoTemporal = pointsPlayer1;
                else { score+="-"; resultadoTemporal = pointsPlayer2;}
                switch(resultadoTemporal)
                {
                    case 0:
                        score+= "Love";
                        break;
                    case 1:
                        score+= "Fifteen";
                        break;
                    case 2:
                        score+= "Thirty";
                        break;
                    case 3:
                        score+= "Forty";
                        break;
                }
            }
        }
    return score;
    }
}