package com.javaex.oop.song.v2;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	
	private int year;
	private int track;
	
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
		
		System.out.printf(this.title + " "+ this.artist);	//	포매팅해줘야 함
		System.out.println();
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void show_Info() {
		System.out.printf("%s, %s ( %s, %d, %d번 track, %s 작곡 ) ",
				artist, title, album, year, track, composer);
		System.out.println();
	}
}
