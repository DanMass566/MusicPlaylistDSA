/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.musicplaylistdsa;
import static java.awt.SystemColor.text;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
/**
 *
 * @author danma
 */
public class MusicPlaylistGUI extends javax.swing.JFrame {
    /*Stacks for users playlists*/
    private Stack<String> Liked;
    private Stack<String> HeavyMetal;
    private Stack<String> SongsYouMightLike;
    /*Boolean keeps track of repeat mode*/
    private boolean isRepeatEnabled = false;

    private void playTrackFromList(Stack<String> HeavyMetal, int heavyMetalIndex, String heavy_Metal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private enum Playlists {LIKED, HEAVYMETAL, SONGSYOUMIGHTLIKE}
    private Playlists currentPlaylists;
    
    /*Getters for the playlists*/
    public Stack<String> getLiked() {
        return Liked;
    }
    
    public Stack<String> getHeavyMetal() {
        return HeavyMetal;
    }
    
    public Stack<String> getSongaYouMightLike() {
        return SongsYouMightLike;
    }
    
    /*holds and adds songs inside of a playlist*/
    private Queue<String> playlistQueue = new LinkedList<>();
    
    private void addToPlaylistQueue(String songName) {
        playlistQueue.add(songName);
    }
    
    /*Variables for the song index*/
    private int likedIndex = 0;
    private int heavyMetalIndex = 0;
    private int songsYouMightLikeIndex = 0;
    
    /*adds songs to the playlist queue from a stack*/
     private void addToPlaylistQueue(Stack<String> songStack) {
        while (!songStack.isEmpty()){
            String songName = songStack.pop();
            playlistQueue.add(songName);
        }
     }
     
     private void searchLiked(String query, StringBuilder StringBuilder) {
         StringBuilder searchResults = new StringBuilder();
         for (String song : Liked) {
             if(song.contains(query)) {
                 StringBuilder /*append*/ = searchResults.append (song).append("\n");
                 TextBox.setText(searchResults.toString());
             }
         }
     }
     /*Functions to play songs from playlists*/
     private void playNextSong(){
         switch (currentPlaylists) {
             case LIKED:
                 playTrackFromList(Liked, likedIndex, "Liked");
                 break;
                 case HEAVYMETAL:
                 playTrackFromList(HeavyMetal, heavyMetalIndex, "Heavy Metal");
                 break;
                 case SONGSYOUMIGHTLIKE:
                 playTrackFromList(SongsYouMightLike, songsYouMightLikeIndex, "Songs You Might Like");
                 default:
                     System.out.println("Unknown Playlist");
                     break;
         }
     }
     
     private void playTrackFromList(LinkedList<String> trackList, int index, String playlistName) {
         if (index < trackList.size()) {
             String currentTrack = trackList.get(index);
             System.out.println("Now Playing: "+ currentTrack);
             index++;
             switch (playlistName) {
                 case "Liked":
                     likedIndex = index;
                     break;
                 case "Heavy Metal":
                     heavyMetalIndex = index;
                     break;
                 case "Songs You Might Like":
                     songsYouMightLikeIndex = index;
                     break;
             }
         }else {
             if (isRepeatEnabled && !trackList.isEmpty()) {
                 index = 0;
                 playTrackFromList(trackList, index, playlistName);
             } else {{
                 System.out.println("End of " + playlistName + " playlist.");
             }
         }
     }
         
         /*Functionality for repeat mode NOT WORKING
         private void toggleRepeatEnabled() {
             isRepeatEnabled = !isRepeatEnabled;
             if (isRepeatEnabled) {
                 repeatButton.setText("Playback: ON");
             } else {
                 repeatButton.setText("Playback: OFF");
             }
         }
         */
         /*Function to play songs from the playlist queue NOT WORKING
         while(!playlistQueue.isEmpty() || i) {
             String currentTrack = playlistQueue.poll();
             if(currentTrack) != null){
             songTitle.setText("Now Playing" + currentTrack);
    }
         */
             
       /* public MusicPlaylistGUI()*/          /*Functionality for repeat mode NOT WORKING
         private void toggleRepeatEnabled() {
             isRepeatEnabled = !isRepeatEnabled;
             if (isRepeatEnabled) {
                 repeatButton.setText("Playback: ON");
             } else {
                 repeatButton.setText("Playback: OFF");
             }
         }
         */
         /*Function to play songs from the playlist queue NOT WORKING
         while(!playlistQueue.isEmpty() || i) {
             String currentTrack = playlistQueue.poll();
             if(currentTrack) != null){
             songTitle.setText("Now Playing" + currentTrack);
    }
         */
             
       /* public MusicPlaylistGUI()*/ {
        Liked = new Stack<>();
        HeavyMetal = new Stack<>();
        SongsYouMightLike = new Stack<>();
        currentPlaylists = Playlists.LIKED;
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MusicApplication = new javax.swing.JLabel();
        EnterSongName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextBox = new javax.swing.JTextArea();
        SearchSong = new javax.swing.JButton();
        ManageSong = new javax.swing.JButton();
        DeleteSong = new javax.swing.JButton();
        Display = new javax.swing.JButton();
        LikedPlaylist = new javax.swing.JButton();
        heavyMetalPlaylist = new javax.swing.JButton();
        songsYouMightLike = new javax.swing.JButton();
        repeatButton = new javax.swing.JToggleButton();
        playButton = new javax.swing.JButton();
        addSong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MusicApplication.setText("Music Application");

        EnterSongName.setText("Enter Song Name:");
        EnterSongName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterSongNameActionPerformed(evt);
            }
        });

        TextBox.setColumns(20);
        TextBox.setRows(5);
        TextBox.setText("TEXT APPEARS HERE");
        jScrollPane1.setViewportView(TextBox);

        SearchSong.setText("Search Song");
        SearchSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSongActionPerformed(evt);
            }
        });

        ManageSong.setText("Manage Songs");
        ManageSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageSongActionPerformed(evt);
            }
        });

        DeleteSong.setText("Delete Song");
        DeleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSongActionPerformed(evt);
            }
        });

        Display.setText("Display ");
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        LikedPlaylist.setText("Liked Playlist ");
        LikedPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LikedPlaylistActionPerformed(evt);
            }
        });

        heavyMetalPlaylist.setText("Heavy Metal Playlist");
        heavyMetalPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heavyMetalPlaylistActionPerformed(evt);
            }
        });

        songsYouMightLike.setText("Songs You Might Like");
        songsYouMightLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songsYouMightLikeActionPerformed(evt);
            }
        });

        repeatButton.setText("Playback: OFF");

        playButton.setText("Play");

        addSong.setText("Add Song");
        addSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SearchSong)
                                    .addComponent(ManageSong, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeleteSong)
                                    .addComponent(Display)
                                    .addComponent(addSong))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LikedPlaylist)
                                    .addComponent(heavyMetalPlaylist)
                                    .addComponent(songsYouMightLike, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EnterSongName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(MusicApplication)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(playButton)
                .addGap(125, 125, 125)
                .addComponent(repeatButton)
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(MusicApplication)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(EnterSongName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LikedPlaylist)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(heavyMetalPlaylist)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(songsYouMightLike))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addSong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchSong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ManageSong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteSong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Display))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(repeatButton)
                    .addComponent(playButton))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageSongActionPerformed
    
    }//GEN-LAST:event_ManageSongActionPerformed

    private void addSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongActionPerformed
        
    }//GEN-LAST:event_addSongActionPerformed

    private void SearchSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchSongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchSongActionPerformed

    private void EnterSongNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterSongNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterSongNameActionPerformed

    private void DeleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteSongActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayActionPerformed

    private void LikedPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LikedPlaylistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LikedPlaylistActionPerformed

    private void heavyMetalPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heavyMetalPlaylistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heavyMetalPlaylistActionPerformed

    private void songsYouMightLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songsYouMightLikeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songsYouMightLikeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicPlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicPlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicPlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicPlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicPlaylistGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteSong;
    private javax.swing.JButton Display;
    private javax.swing.JTextField EnterSongName;
    private javax.swing.JButton LikedPlaylist;
    private javax.swing.JButton ManageSong;
    private javax.swing.JLabel MusicApplication;
    private javax.swing.JButton SearchSong;
    private javax.swing.JTextArea TextBox;
    private javax.swing.JButton addSong;
    private javax.swing.JButton heavyMetalPlaylist;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton playButton;
    private javax.swing.JToggleButton repeatButton;
    private javax.swing.JButton songsYouMightLike;
    // End of variables declaration//GEN-END:variables
}
