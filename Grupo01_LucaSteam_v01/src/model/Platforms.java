package model;

/**
 * Clase principal de Control del proyecto
 * 
 * @author Grupo 01
 *
 */

public enum Platforms {
	
	WII, NES, GB, DS, X360, PS3, PS2, SNES, GBA, 
	PS4, N64, PS, XB, PC, A2600, PSP, XONE, GC, 
	WIIU, GEN, DC, PSV, SAT, SCD, WS, NG, TG16, GG, PCFX,
	DS3,
	DO3;
	
	
	//METODO DONDE PASAR DE STRING A PLATAFORMA (ENUM)
	public static Platforms elegirPlataforma(String s) {
		Platforms p = null;
		switch (s) {
		case "Wii": {
			p = Platforms.WII;
			return p;
		}
		case "NES": {
			p = Platforms.NES;
			return p;
		}
		case "GB": {
			p = Platforms.GB;
			return p;
		}
		case "DS": {
			p = Platforms.DS;
			return p;
		}
		case "X360": {
			p = Platforms.X360;
			return p;
		}
		case "PS3": {
			p = Platforms.PS3;
			return p;
		}
		case "PS2": {
			p = Platforms.PS2;
			return p;
		}
		case "SNES": {
			p = Platforms.SNES;
			return p;
		}
		case "GBA": {
			p = Platforms.GBA;
			return p;
		}
		case "PS4": {
			p = Platforms.PS4;
			return p;
		}
		case "N64": {
			p = Platforms.N64;
			return p;
		}
		case "PS": {
			p = Platforms.PS;
			return p;
		}
		case "XB": {
			p = Platforms.XB;
			return p;
		}
		case "PC": {
			p = Platforms.PC;
			return p;
		}
		case "2600": {
			p = Platforms.A2600;
			return p;
		}
		case "PSP": {
			p = Platforms.PSP;
			return p;
		}
		case "XOne": {
			p = Platforms.XONE;
			return p;
		}
		case "GC": {
			p = Platforms.GC;
			return p;
		}
		case "WiiU": {
			p = Platforms.WIIU;
			return p;
		}
		case "GEN": {
			p = Platforms.GEN;
			return p;
		}
		case "DC": {
			p = Platforms.DC;
			return p;
		}
		case "PSV": {
			p = Platforms.PSV;
			return p;
		}
		case "SAT": {
			p = Platforms.SAT;
			return p;
		}
		case "SCD": {
			p = Platforms.SCD;
			return p;
		}
		case "WS": {
			p = Platforms.WS;
			return p;
		}
		case "NG": {
			p = Platforms.NG;
			return p;
		}
		case "TG16": {
			p = Platforms.TG16;
			return p;
		}
		case "GG": {
			p = Platforms.GG;
			return p;
		}
		case "PCFX": {
			p = Platforms.PCFX;
			return p;
		}
		case "3DS": {
			p = Platforms.DS3;
			return p;
		}
		case "3DO": {
			p = Platforms.DO3;
			return p;
		}
		default:
			return null;
		}
		
	
	}


}
